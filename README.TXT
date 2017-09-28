/******************************************************************************
 *  Pattern Recognition readme.txt template
 *****************************************************************************/

Name: Wurood Mandawi             
NetID:            
Precept:          

Partner name:     
Partner login:    
Partner precept:

Hours to complete assignment (optional): +48



/******************************************************************************
 *  Step 1.  Explain *briefly* how you implemented brute force.
 *           Describe how you implemented compareTo() and the
 *           slopeTo() methods in the Point data type.
 *****************************************************************************/
For Brute I have a quadratic nested for loop that goes throw p to N-3, N-2, N-1 and N
and I move the P once in every loop
then I check if the slope between each for points is the same then if it is I save
the points in an array and add them to the point sequence. Then I checked for duplicate 
by having two for loops that go throe the points untill the end and check if those points are equal 
and then if they are I throw an exception.
and just return for the others. 

For compareTo() I compare this y with that and the x and if they are equal I return a 0
then else if the y is greater or just the x then I return a -1 and else return a +1.
For slopeTo() I check the x and if they are equal I return a positive inf
and if y is equal I return +0 and else if compare to equals 0 then return a negative inf
else I return the slope.


/******************************************************************************
 *  Step 2.  Explain *briefly* how you implemented the sorting solution.
 *           What steps did you do to avoid printing permutations
 *           and subsegments?
 *****************************************************************************/




/******************************************************************************
 *  Empirical    Fill in the table below with actual running times in
 *  Analysis     seconds when reasonable (say 180 seconds or less).
 *               You can round to the nearest tenth of a second.
 *
 *  Estimate (using tilde notation) the running time (in seconds) of
 *  your two main functions as a function of the number of points N.
 *
 *  Explain how you derive any exponents.
 *****************************************************************************/

    
      N       brute       sorting
 ---------------------------------
    150
    200
    300
    400
    800
   1600
   3200
   6400
  12800


Brute:    ~

Sorting:  ~




/******************************************************************************
 *  Theoretical   Give the order of growth of the worst-case running
 *                time of your programs as a function of N. Justify
 *                your answer briefly.
 *****************************************************************************/

Brute: ~N^4

Sorting:



/******************************************************************************
 *  Known bugs / limitations. For example, if your program prints
 *  out different representations of the same line segment when there
 *  are 5 or more points on a line segment, indicate that here.
 *****************************************************************************/
Fast does not do the right thing.


/******************************************************************************
 *  Describe whatever help (if any) that you received.
 *  Don't include readings, lectures, and precepts, but do
 *  include any help from people (including course staff, lab TAs,
 *  classmates, and friends) and attribute them by name.
 *****************************************************************************/
Josh explained Brute for me
Prof. Green explained Fast 


/******************************************************************************
 *  Describe any serious problems you encountered.                    
 *****************************************************************************/
I spent too much time doing Fast and I feel like I get the idea but implenmenting
it was the hard thing.



/******************************************************************************
 *  If you worked with a partner, assert below that you followed
 *  the protocol as described on the assignment page. Give one
 *  sentence explaining what each of you contributed.
 *****************************************************************************/
N/A






/******************************************************************************
 *  List any other comments here. Feel free to provide any feedback   
 *  on how much you learned from doing the assignment, and whether    
 *  you enjoyed doing it.                                             
 *****************************************************************************/
Eventhough I started working on this early, I still didnt have enough time.
Fast was the hardest and took the most time.
