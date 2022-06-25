package ru.vsu.cs.pekshev.T5.tree.bst.avl;

import ru.vsu.cs.pekshev.T5.tree.bst.BSTree ;
import ru.vsu.cs.pekshev.T5.tree.bst.BSTreeAlgorithms ;
import ru.vsu.cs.pekshev.T5.tree.bst.BSTreeMap;

/**
 * Реализация словаря на базе АВЛ-деревьев
 *
 * @param <K>
 * @param <V>
 */
public class AVLTreeMap<K extends Comparable<K>, V> implements BSTreeMap<K, V> {

    private final BSTree<BSTreeMap.MapTreeEntry<K, V>> tree = new AVLTree<>();

    @Override
    public BSTree<MapTreeEntry<K, V>> getTree() {
        return tree;
    }
}
