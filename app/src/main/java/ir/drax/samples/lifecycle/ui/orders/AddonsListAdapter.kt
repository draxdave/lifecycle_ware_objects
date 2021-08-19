package ir.drax.samples.lifecycle.ui.orders

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ir.drax.samples.lifecycle.network.model.Addon
import lifecycle.databinding.AddonListItemBinding

class AddonsListAdapter(private var addons: List<Addon>) : RecyclerView.Adapter<AddonsListAdapter.RepositoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepositoryViewHolder {
        val binding = AddonListItemBinding.inflate(
            LayoutInflater.from(parent.context),
            null,
            false
        )

        return RepositoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RepositoryViewHolder, position: Int) {
        holder.bind(addons[position])
    }

    override fun getItemCount(): Int = addons.size

    /**
     * A ViewHolder for the [AddonsListAdapter]
     */
    inner class RepositoryViewHolder(private val binding: AddonListItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(addon: Addon) {
            with(binding) {
                // setup bind data
                this.addon = addon
            }
        }
    }
}