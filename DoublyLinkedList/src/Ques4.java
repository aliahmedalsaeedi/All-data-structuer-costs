public class Ques4 {
    public static <DoublyLinkedList> DoublyLinkedList concatenate(DoublyLinkedList L, DoublyLinkedList M) {
    DoublyLinkedList L = new DoublyLinkedList(); // initialize a new doubly linked list with header and trailer sentinel nodes
    if (L.isEmpty() && M.isEmpty()) { // if L and M are both empty lists, return L′
        return L′;
    } else if (L.isEmpty()) { // if L is an empty list, set L′ to be a copy of M and return L′
        L′ = M.copy();
        return L′;
    } else if (M.isEmpty()) { // if M is an empty list, set L′ to be a copy of L and return L′
        L′ = L.copy();
        return L′;
    } else { // if L and M are non-empty lists
        L′.setHeader(L.getHeader()); // set the header of L′ to be the header of L
        L′.setTrailer(M.getTrailer()); // set the trailer of L′ to be the trailer of M
        L.getTrailer().setNext(M.getHeader()); // set the next pointer of the trailer of L to be the header of M
        M.getHeader().setPrev(L.getTrailer()); // set the previous pointer of the header of M to be the trailer of L
        return L′; // return L′ as the concatenated list
    }
}

}
