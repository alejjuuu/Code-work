ggplot(data = Newyears), aes(x=carrier, y=, fill?))+
  geom_bar(stat ="identity", position= position = position_doge()) +
  labs (
    ttile = "?Enter title gere"
  )


NewYears<- subset(flights,(month ==1 & day==1)) | (month = 12 & day ==31)
Tranksgiving<- subset
Christmas <-subset(flights,(month ==12)& (day ==23 & 25))

ggplot(data = Newyears), aes(x=carrier))+
  geom_bar() +
  labs (
    ttile = "New years Flights"
    subtitle ="Enter research findings here"
    caption="Luis Velasquez"
  )

Christmas1 <- left_join(x=Christmas, y= airlines, by ='carrier')
NewYears1 <- left_join(x=NewYears, y=airlines, by = 'carrier')


ggplot(data = Christmas1, aes(x=day, fill= name))+
  geom_bar(position = "dodge")

Christmas2 <-subset(Christmas1,carrier ==c('B6','UA','DL'))


left_join(flights,weather)


ggplot(data=NewYears, aes(x=carrier, y=, fill=?)) +
  geom_bar(stat="identity", position=position_dodge())+
  labs(
    title = "?Enter title here",
    subtitle = "?Enter research findings here",
    caption = "?enter your first and last name here"
  )

NewYears<-subset(flights,(month==1 & day==1) | (month==1 & day==2) ) #1618 rows

Thanksgiving<-subset(flights,(month==11) & (day >19 & day<25) ) #Nov 20 to 24 4616 rows

NewYears<-subset(flights,month==1 & day==1) 

NewYears$day<-as.character(NewYears$day)

ggplot(data=NewYears2, aes(x=day, fill=name))+
  geom_bar(position = "dodge")+
  labs(
    title = "New Years Flights 2013",
    subtitle = "Top 3 carriers",
    caption = "Data Source: flights and airlines data in R"
  )

NewYears1<-left_join(x=NewYears,y=airlines , by = "carrier")
NewYears2<-subset(NewYears1,carrier==c("B6","UA","DL"))

