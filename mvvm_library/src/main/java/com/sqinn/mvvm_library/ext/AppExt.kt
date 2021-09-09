package com.sqinn.mvvm_library.ext


fun List<*>?.isNull(): Boolean {
    return this?.isEmpty() ?: true
}

fun List<*>?.isNotNull(): Boolean {
    return this != null && this.isNotEmpty()
}


