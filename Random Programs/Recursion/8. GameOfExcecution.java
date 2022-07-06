/******************************************************************************
Josephus problem

To seek revenge on Midgard, Loki devises a plan to torture the humans by making
 them take part in one of his silly games. He makes N people sit in a circle. 
 He says he will kill every kth person sitting in the circle, starting from 1st
person.Loki performs his revenge prank until and unless 1 survivor remains.
What is the initial position of the survivor, if the indexing is clockwise?

*******************************************************************************/
public static int safe_Position(int n, int k)
{
      return solve_problem(n, k) + 1;
}
public static int solve_problem(int n, int k){
    if(n == 1){
      return 0;
    }
    return (solve_problem(n-1,k) + k) % n;
}