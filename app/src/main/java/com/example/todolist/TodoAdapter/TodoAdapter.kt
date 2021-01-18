package com.example.todolist.TodoAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.todolist.R
import com.example.todolist.models.Todo
import kotlinx.android.synthetic.main.list_item_todo.view.*

class TodoAdapter(
    val todos: ArrayList<Todo>
):RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {

    class TodoViewHolder(val itemView: View) : RecyclerView.ViewHolder(itemView){

        val tvTodoTask = itemView.findViewById<TextView>(R.id.tvTodoTask)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val li: LayoutInflater = parent?.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val itemView =li.inflate(R.layout.list_item_todo,parent,false)
        return TodoViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder?.tvTodoTask?.text = todos[position].task
    }

    override fun getItemCount(): Int {
        return todos.size
    }
}