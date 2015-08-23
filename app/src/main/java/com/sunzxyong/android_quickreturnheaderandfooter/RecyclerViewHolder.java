package com.sunzxyong.android_quickreturnheaderandfooter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by 晓勇 on 2015/8/22 0022.
 */
public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    public TextView mTextView;
    public RecyclerViewHolder(View itemView) {
        super(itemView);
        mTextView = (TextView) itemView.findViewById(R.id.tv_content);
    }
}
