# Doubt: Why do we use `X - 1`?

I am solving the **Bus Rows** problem.

Suppose every row has `M = 2` seats:

```text
Row 1 → seats 1, 2
Row 2 → seats 3, 4
Row 3 → seats 5, 6
```

We use this formula to find the row:

```java
int row = (X - 1) / M + 1;
```

I understand the `+ 1`, but I don't understand **why we need `X - 1`**.

For example:

### X = 2

```text
2 / 2 = 1
1 + 1 = 2
```

But seat 2 is in **Row 1**.

### X = 3

```text
3 / 2 = 1
1 + 1 = 2
```

Seat 3 is in **Row 2**, so this works.

So my confusion is:

> Why can't we simply use `X / M + 1`?

What exactly does subtracting `1` from `X` fix?

Please explain it using `X = 1, 2, 3, 4` and `M = 2`, without assuming I already understand zero-based indexing.
