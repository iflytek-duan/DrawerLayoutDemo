package com.zihao.drawerlayoutdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.zihao.drawerlayoutdemo.R;

import java.util.List;

/**
 * 内容适配器
 * Created by Administrator on 2016/6/7 10:22.
 */
public class ContentAdapter extends BaseAdapter {
    private Context context;
    private List<String> list;

    public ContentAdapter(Context context, List<String> list) {
        super();
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            holder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(
                    R.layout.content_item,parent,false);
            holder.textView=(TextView) convertView.findViewById(R.id.content_item_tv);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.textView.setText(list.get(position));
        return convertView;
    }

    static class ViewHolder {
        public TextView textView;
    }

}