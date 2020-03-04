package com.engineer.plugin.extensions.model

/**
 * @author rookie
 * @since 11-29-2019
 */

class TaskDetail : Comparable<TaskDetail> {

    /**
     * ms
     */
    var total = 0f
    /**
     * ns
     */
    var start = 0L
    /**
     * ns
     */
    var end = 0L
    var name = ""

    override fun compareTo(other: TaskDetail): Int {
        return this.total.compareTo(other.total)
    }

}