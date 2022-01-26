iPad_Red<-c(50,60,40)
iPad_Black<-c(60,5,30)
iPad_Rose<-c(100,2,10)
Country<-c("US", "Italy", "France")
Apple<-data.frame(Country,iPad_Red,iPad_Black,iPad_Rose)

Sales= iPad_Red + iPad_Black + iPad_Rose

ggplot(data=Apple1, aes(x=Country, y=Sales, fill=Country)) +
  geom_bar(stat="identity", position=position_dodge())+
  labs(
    title = "Total Ipad sales per country",
    subtitle = "The US sold more Ipads",
    caption = "Luis Velasquez"
  )

#The below code does not work 
#productname = 'iPad_Red', 'iPad_Black','iPad_Rose'
#Apple1 <- Apple %>% separate( Sales, into=c(“name”, ”color”),sep ="_")
#Apple3 <- Apple2 %>% separate( iPad_Black, into=c(“name”, ”color”),sep ="_")
#Apple4 <- Apple3 %>% separate( iPad_Rose, into=c(“name”, ”color”),sep ="_")