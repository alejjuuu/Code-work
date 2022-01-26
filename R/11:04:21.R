#11/04/21
#Joins
#1) How many delays/ cancelled flightsare there?
#  1) which airline has most cancellations?
#  2) Does age of plane matter?
#  3) Does plane manufact matter?
#  4) Does weather matter?

library(tidyverse)
library(nycflights13)
flights2<-left_join(flights,airlines)
delaybycarrier<-aggregate(flights2$arr_delay,by=list(flights2$name),FUN=mean,na.rm=TRUE) #Why doesn't this work

flights3<-subset(flights2,arr_delay>60)
delaybycarrier<-aggregate(flights3$arr_delay,by=list(flights3$name),FUN=mean,na.rm=TRUE) #Why doesn't this work

Hourdelay<-table(flights3$name)#the airlines counting up the arrival delays above 30 min
Hourdelay<-as.data.frame(Hourdelay)

TotalFlightsbyCarrier<-table(flights2$name)
TotalFlightsbyCarrier<-as.data.frame(TotalFlightsbyCarrier)
TotalFlightsbyCarrier

PercentDelay<-full_join(Hourdelay,TotalFlightsbyCarrier,by="Var1")

mutate(PercentDelay,percent_delay=round((Freq.x/Freq.y) * 100,2))
flights2<-left_join(flights2,planes, by ="tailnum")

#join to look at does plane model, manufact or year effect delays

flights2<-left_join(flights2,planes,by="tailnum")
delaybymanufacturer<-aggregate(flights2$arr_delay,by=list(flights2$manufacturer.y),FUN=mean,na.rm=TRUE)
delaybymanufacturer

# build a table 
# professor code 
flights2<-left_join(flights,airlines)
delaybycarrier<-aggregate(flights2$arr_delay,by=list(flights2$name),FUN=mean,na.rm=TRUE) #Why doesn't this work

flights3<-subset(flights2,arr_delay>30)
delaybycarrier<-aggregate(flights3$arr_delay,by=list(flights3$name),FUN=count,na.rm=TRUE) #Why doesn't this work

table(flights3$name)#the airlines counting up the arrival delays above 30 min
# end here
