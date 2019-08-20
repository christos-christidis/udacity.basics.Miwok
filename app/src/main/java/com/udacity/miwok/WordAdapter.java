package com.udacity.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

class WordAdapter extends ArrayAdapter<Word> {

    private final int mColorResourceId;

    WordAdapter(Context context, List<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word word = getItem(position);
        if (word != null) {
            ImageView imageView = listItemView.findViewById(R.id.image);
            if (word.hasImage()) {
                imageView.setImageResource(word.getImageResourceId());
                imageView.setVisibility(View.VISIBLE);
            } else {
                imageView.setVisibility(View.GONE);
            }

            TextView miwokTextView = listItemView.findViewById(R.id.miwok_text_view);
            miwokTextView.setText(word.getMiwokTranslation());

            TextView defaultTextView = listItemView.findViewById(R.id.default_text_view);
            defaultTextView.setText(word.getDefaultTranslation());

            View textContainer = listItemView.findViewById(R.id.text_container);
            int color = ContextCompat.getColor(getContext(), mColorResourceId);
            textContainer.setBackgroundColor(color);
        }

        return listItemView;
    }
}
