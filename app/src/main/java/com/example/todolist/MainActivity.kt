package com.example.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todolist.TodoAdapter.TodoAdapter
import com.example.todolist.models.Todo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val todos:ArrayList<Todo> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        todos.add(Todo("First",false))

        rvTodos.layoutManager = LinearLayoutManager(this)
        val todoAdapter: TodoAdapter= TodoAdapter(todos)
        rvTodos.adapter=todoAdapter

        btnadd.setOnClickListener {
            val newTodo= ettodolist.text.toString()
            todos.add(Todo(newTodo,false))
            todoAdapter.notifyDataSetChanged()
        }

    }
}