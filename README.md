# ceiling-fan-project
Project for Medavie Blue Cross coding assessment

In Java,  implement a simple ceiling fan with these characteristics:
•    The unit has 2 pull cords:   One increases the speed each time it is pulled.  There are 3 speed settings, and an “off” (speed 0) setting.   If the cord is pulled on speed 3, the fan returns to the “off” setting. One reverses the direction of the fan at the current speed setting. Once the direction has been reversed, it remains reversed as we cycle through the speed settings, until reversed again.
•    You can assume the unit is always powered (no wall switch)

This is a SpringBoot project.In this project, we have assumed the initial settings of the fan to be turned off and its speed change direction to be forward. This project will be hosted on localhost:8080 when run in a maven supported IDE.

These are the following calls that can be made:

To change the speed : http://localhost:8080/api/v1/changespeed

To change the direction of speed change : http://localhost:8080/api/v1/reversespeed

