library(tidyverse)

iPad_Red<-c(50,60,40)
iPad_Black<-c(60,5,30)
iPad_Rose<-c(100,2,10)
Country<-c("US", "Italy", "France")
Apple<-data.frame(Country,iPad_Red,iPad_Black,iPad_Rose)

apple2 <- Apple %>% pivot_longer(c('iPad_Red','iPad_Black','iPad_Rose'),names_to ="Product", values_to ="Sales")
apple2

apple3 <- apple2 %>% separate(Product, into = c("ProductName","Color"), sep = "_")
apple3

ggplot(data=apple3, aes(x=Country, y=Sales, fill=Color)) +
  +     geom_bar(stat="identity", position=position_dodge())+
  +     labs(
    +         title = "Country vs. iPad Sales by Color",
    +         subtitle = "As seen in the graph, Rose iPads are much more",
    +         caption = "Luis Velasquez")