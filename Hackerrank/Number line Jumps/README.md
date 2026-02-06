## Kangaroo Meeting Problem

You are given two kangaroos on a number line, both facing toward the positive direction (toward positive infinity).

* The **first kangaroo** starts at position **x1** and jumps **v1** meters per jump.
* The **second kangaroo** starts at position **x2** and jumps **v2** meters per jump.

Both kangaroos jump at the same time. Your task is to determine whether they will ever land on the **same position at the same time** after the same number of jumps.

If they can meet, return **YES**. Otherwise, return **NO**.

---

## Function Description

Complete the function `kangaroo` which takes the following parameters:

* `int x1`: starting position of kangaroo 1
* `int v1`: jump distance of kangaroo 1
* `int x2`: starting position of kangaroo 2
* `int v2`: jump distance of kangaroo 2
## Input Format
A single line containing **four space-separated integers**:
x1 v1 x2 v2
## Constraints
* ( 0 \le x1 < x2 \le 10000 )
* ( 1 \le v1 \le 10000 )
* ( 1 \le v2 \le 10000 )
## Output Format
Print **YES** if the two kangaroos can land on the same location at the same time.
Otherwise, print **NO**.

## Sample Input 0
0 3 4 2
## Sample Output 0
YES
## Sample Input 1
0 2 5 3
## Sample Output 1
NO
