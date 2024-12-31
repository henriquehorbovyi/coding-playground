package dev.henriquehorbovyi.leetcode

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.value
 *
 * Definition for singly-linked list.
 * class ListNode(var value: Int) {
 *     var next: ListNode? = null
 * }
 */

class ListNode(var value: Int) {
	var next: ListNode? = null
}

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
	val mergedNode: ListNode = ListNode(0)
	var head: ListNode = mergedNode

	var headList1 = list1
	var headList2 = list2

	// Merge while both lists are non-null
	while (headList1 != null && headList2 != null) {
		if (headList1.value < headList2.value) {
			head.next = headList1
			headList1 = headList1.next
		} else {
			head.next = headList2
			headList2 = headList2.next
		}

		// Move to the end of the merged list
		head.next?.let { head = it }
	}

	// Attach the remaining portion of the list
	head.next = headList1 ?: headList2

	return mergedNode.next
}

fun main() {

	val f = ListNode(6)
	val e = ListNode(5).apply { next = f }
	val d = ListNode(2).apply { next = e }

	val c = ListNode(3)
	val b = ListNode(2).apply { next = c }
	val a = ListNode(1).apply { next = b }


	mergeTwoLists(a, d)
}