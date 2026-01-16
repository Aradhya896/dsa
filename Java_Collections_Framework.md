# 📦 Java Collections Framework (JCF) – Quick Revision Notes

---

## 🔹 Why Collections (vs Arrays)
- Arrays have fixed size
- No built-in methods for search, sort, delete
- Manual resizing is inefficient & error-prone
- Collections are dynamic, powerful, and easy to use

---

## 🔹 What is Java Collections Framework
- Part of java.util package
- Set of interfaces + classes + algorithms
- Used to store and manipulate groups of objects
- Follows a standard hierarchy

---

## 🔹 Framework Hierarchy
- Iterable → enables for-each loop
- Collection → base interface (add, remove, size)
- List – ordered, duplicates allowed
- Set – unordered, no duplicates
- Queue / Deque – processing order
- Map – key-value pairs (not a Collection)

---

## 🔹 List Interface
**Features**
- Ordered
- Duplicates allowed
- Index-based access

**Important Methods**
- add(), add(index, e)
- get(index)
- set(index, e)
- remove()
- size()
- contains()
- indexOf()
- subList()

**Implementations**
- ArrayList – fast access, slow mid insert
- LinkedList – fast insert/delete
- Vector – synchronized (legacy)

---

## 🔹 Set Interface
**Features**
- No duplicates

**Important Methods**
- add()
- remove()
- contains()
- size()
- iterator()

**Implementations**
- HashSet – unordered, fast
- LinkedHashSet – insertion order
- TreeSet – sorted (Red-Black Tree)

---

## 🔹 Queue / Deque
**Important Methods**
- offer(), poll(), peek()
- addFirst(), addLast()
- pollFirst(), pollLast()

**Implementations**
- Queue – FIFO
- Deque – both ends
- PriorityQueue – priority-based

---

## 🔹 Map Interface
**Features**
- Key-value pairs
- Unique keys

**Important Methods**
- put()
- get()
- remove()
- containsKey()
- keySet()
- values()
- entrySet()

**Implementations**
- HashMap – fast, unordered
- LinkedHashMap – insertion order
- TreeMap – sorted keys

---

## 🔹 Generics
- Compile-time type safety
- Avoids ClassCastException

---

## 🔹 Collections Utility Class
**Important Methods**
- sort()
- reverse()
- shuffle()
- min(), max()
- frequency()
- unmodifiableList()

---

## 🔹 Internal Working
- ArrayList → resizable array
- LinkedList → nodes
- HashMap/HashSet → hash table
- TreeMap/TreeSet → Red-Black Tree

---

## 🔹 Concurrent Collections
- Thread-safe
- Better than synchronized collections
- Examples: ConcurrentHashMap, CopyOnWriteArrayList

---

## 🔹 Quick Use Guide
- Fast access → ArrayList
- Unique elements → HashSet
- Sorted data → TreeSet / TreeMap
- Key lookup → HashMap
- Thread-safe → Concurrent collections
