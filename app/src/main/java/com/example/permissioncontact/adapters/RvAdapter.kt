package com.example.permissioncontact.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.permissioncontact.databinding.ItemContactInfoBinding
import com.example.permissioncontact.models.Contact

class RvAdapter (var list: List<Contact>) : RecyclerView.Adapter<RvAdapter.Vh>() {
    inner class Vh(private val itemContactInfoBinding: ItemContactInfoBinding): RecyclerView.ViewHolder(itemContactInfoBinding.root){
        fun onBind(contact: Contact){
            itemContactInfoBinding.tvNameItem.text = contact.name
            itemContactInfoBinding.tvNumberItem.text = contact.number
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemContactInfoBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size


}