//8.5

package asg03;

public class Time2 {
    private int secondsAfterMidnight;  // 0 - (24 * 60 * 60 -1)

   // Time2 constructor initializes each instance variable to zero;
   // ensures that Time object starts in a consistent state
    public Time2() { 
        this( 0, 0, 0 ); // invoke Time2 constructor with three arguments
   }

   // Time2 constructor: hour supplied, minute and second defaulted to 0
    public Time2( int h ) { 
        this( h, 0, 0 ); // invoke Time2 constructor with three arguments
   }

   // Time2 constructor: hour and minute supplied, second defaulted to 0
    public Time2( int h, int m ) { 
        this( h, m, 0 ); // invoke Time2 constructor with three arguments
   }

   // Time2 constructor: hour, minute and second supplied
    public Time2( int h, int m, int s ) { 
        setTime( h, m, s ); // invoke setTime to validate time
   }

   // Time2 constructor: another Time2 object supplied
    public Time2( Time2 time ) {
        this( time.getHour(), time.getMinute(), time.getSecond() ); // invoke setTime to validate time
   }

   // set a new time value using universal time; perform 
   // validity checks on data; set invalid values to zero
    public void setTime( int h, int m, int s ) {
        if ( (( h >= 0) && (h < 24 )) ) {
            secondsAfterMidnight = h * 60 * 60;
        } else {
            secondsAfterMidnight = 0;
        }
       
        if ( (( m >= 0) && (m < 60 )) ) {
            secondsAfterMidnight += m * 60;
        }
       
        if ( (( s >= 0) && (s < 60 )) ) {
            secondsAfterMidnight += s;
        }
   }
   
    public int getHour () {
        return secondsAfterMidnight / 3600;
   }
    public int getMinute () {
        return secondsAfterMidnight % 3600 / 60;
   }
    public int getSecond () {
        return secondsAfterMidnight % 60;
   }

   // convert to String in universal-time format
    public String toUniversalString() {
        return String.format( 
         "%02d:%02d:%02d", getHour(), getMinute(), getSecond() );
   } // end method toUniversalString

   // convert to String in standard-time format (H:MM:SS AM or PM)
    public String toString() {
        return String.format( "%d:%02d:%02d %s", 
         ( (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12 ),
         getMinute(), getSecond(), ( getHour() < 12 ? "AM" : "PM" ) );
   } // end method toString
} // end class Time2