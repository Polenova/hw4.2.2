package ru.android.polenova;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class ContactAdapter extends BaseAdapter {

    private List<ContactItem> contactItemList;
    private LayoutInflater layoutInFlater;
    Context myContext;

    ContactAdapter(Context context, List<ContactItem> contactItemList) {
        myContext = context;
        this.contactItemList = contactItemList;
        layoutInFlater = LayoutInflater.from(context);
    }

    void addItem(ContactItem item) {
        this.contactItemList.add(item);
        notifyDataSetChanged();
    }

    void removeItem(int position) {
        contactItemList.remove(position);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return contactItemList.size();
    }

    @Override
    public Object getItem(int position) {
        return contactItemList.get(position);
    }

    public ContactItem getContactItem(int position) {
        return contactItemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = layoutInFlater.inflate(R.layout.list_item, parent, false);

        }
        ContactItem contactItem = getContactItem(position);
        ImageView icon = view.findViewById(R.id.ImageViewIcon);
        TextView call = view.findViewById(R.id.TextViewCall);
        TextView contact = view.findViewById(R.id.TextViewContact);
        Button buttonRemove = view.findViewById(R.id.ButtonRemove);
        contact.setText(contactItem.getContactInfo());
        call.setText(contactItem.getCallContact());
        icon.setImageDrawable(contactItem.getImageIcon());
        buttonRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                removeItem(position);
            }
        });
        view.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(myContext, getContactItem(position).getContactInfo(), Toast.LENGTH_SHORT).show();
                return false;
            }
        });
        return view;
    }
}
