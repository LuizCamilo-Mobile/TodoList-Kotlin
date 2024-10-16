package br.com.todolistkotlin

data class Todo(
    val task: String,
    var isChecked: Boolean = false
)