package HashMapDemo.IdentityHashMapDemo;

import java.util.*;

/*
Key Characteristics of IdentityHashMap:

Uses Reference Equality (==):
Unlike HashMap, which uses .equals() to compare keys, IdentityHashMap checks whether two keys refer to the same memory address.

Different Behavior Than HashMap:
If two different objects have the same content, IdentityHashMap treats them as separate keys.
In contrast, HashMap considers them the same key if .equals() returns true.

Faster Lookups (in Some Cases):
Since it doesn’t call .equals(), it can be faster in cases where identity comparison (==) is sufficient.

Less Common in Everyday Use.

IdentityHashMap is useful when key uniqueness is based on object identity rather than content.
*/

public class IdentityHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> identityMap = new IdentityHashMap<>();
        Map<String, Integer> hashMap = new HashMap<>();

        String key1 = new String("Hello");
        String key2 = new String("Hello");  // New object, same content

        identityMap.put(key1, 100);
        identityMap.put(key2, 200);

        hashMap.put(key1, 100);
        hashMap.put(key2, 200);

        System.out.println("IdentityHashMap: " + identityMap);
        // Output: {Hello=100, Hello=200} (Treats them as different keys)

        System.out.println("HashMap: " + hashMap);
        // Output: {Hello=200} (Overwrites the key because equals() returns true)
    }
}
/*
An IdentityHashMap in Java is a special implementation of Map that compares keys using reference equality (==) instead
of object equality (equals()).

This means that two different objects with the same content are treated as different keys.

Key Characteristics of IdentityHashMap:

Uses Reference Equality (==):

Unlike HashMap, which uses .equals() to compare keys, IdentityHashMap checks whether two keys refer to the same memory address.
Different Behavior Than HashMap.

If two different objects have the same content, IdentityHashMap treats them as separate keys.

In contrast, HashMap considers them the same key if .equals() returns true.

Faster Lookups (in Some Cases):
Since it doesn’t call .equals(), it can be faster in cases where identity comparison (==) is sufficient.
Less Common in Everyday Use.

IdentityHashMap is useful when key uniqueness is based on object identity rather than content.

Key Observations from the Output:
IdentityHashMap stores both entries separately because key1 and key2 are different objects.
HashMap overwrites the value because it considers key1 and key2 to be the same key.

When to Use IdentityHashMap?
? When you need reference-based uniqueness, such as:

Tracking instances of mutable objects (e.g., caching, object pooling).
Serialization frameworks that need to track object identity.
Graph processing algorithms where different instances need to be recognized separately.

? Do NOT use IdentityHashMap when:
You need logical equality (equals()).
You are storing common types like String, Integer, or custom objects where .equals() makes sense.
*/