package learning.demo.algorithm.search.HashTable;

import learning.demo.algorithm.search.SequentialSearchST;

/**
 * 基于拉链法的散列表
 * 
 * @author tianxingke
 * 
 * @param <Key>
 * @param <Value>
 */
public class SeparateChainingHashST<Key, Value> {
	private int N; // 键值对总数
	private int M; // 散列表大小
	private SequentialSearchST<Key, Value>[] st; // 存放链表对象的数组

	public SeparateChainingHashST() {
		this(997);
	}

	public SeparateChainingHashST(int M) {
		// 创建M条链表
		this.M = M;
		st = (SequentialSearchST<Key, Value>[]) new SequentialSearchST[M];
		for (int i = 0; i < M; i++) {
			st[i] = new SequentialSearchST(); // TODO ??此处是何意,为何还要再一次创建对象
		}
	}

	private int hash(Key key) {
		return (key.hashCode() & 0x7fffffff) % M;
	}

	public Value get(Key key) {
		return (Value) st[hash(key)].get(key);
	}

	public void put(Key key, Value val) {
		st[hash(key)].put(key, val);
	}

	//--待实现
	public Iterable<Key> keys() {
		return null;
	}
}
