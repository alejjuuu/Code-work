Orange3 <-Orange
OrangeModel<-lm(circumference~0+Tree,data=Orange3)
OrangeModel
summary(OrangeModel)

grid <- Orange3 %>% 
data_grid(Tree) %>% 
add_predictions(OrangeModel)
grid

aggregate(Orange3$circumference,by =list(Orange3$Tree),FUN=mean)

ggplot(Orange2, aes (Tree)) + 
geom_point(aes(y=circumference)) +
geom_point(data = grid,aes(y = pred), colour = "red",size = 4)

lm(formula = circumference ~ 0 + Tree, data = Orange3)
aggregate(PM, by = list(PM$state), FUN = mean)



chickwts1 <- chickwts
chickModel<-lm(weight~0+feed,data=chickwts1)
summary(chickModel)

grid <- chickwts1 %>% 
  data_grid(feed) %>% 
  add_predictions(chickModel)
grid

aggregate(x=chickwts$weight, by = list(chickwts$feed), FUN = sum)

ggplot(chickwts1, aes (feed)) + 
  geom_point(aes(y=weight)) +
  geom_point(data = grid,aes(y = pred), colour = "red",size = 4)




