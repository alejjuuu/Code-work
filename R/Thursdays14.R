# Thursday Octuber 14

who2 <- who %>%
    +     pivot_longer(
    +         cols = new_sp_m014:newrel_f65, 
    +         names_to = "key", 
    +         values_to = "cases", 
    +         values_drop_na = TRUE) %>% 
    +     mutate(key = stringr::str_replace(key, "newrel", "new_rel")) %>%
    +     separate(key, c("new", "var", "sexage")) %>% 
    +     select(-new, -iso2, -iso3) %>% 
    +     separate(sexage, c("sex", "age"), sep = 1)

# Tuberculosis cases world wide male vs female 
#ggplot graph 
ggplot(data = who2) + geom_point(mapping = aes(x = sex, y = cases,color = sex))

#-----------------------------------

#who1 by cases
who1 <- who %>% 
  pivot_longer(
    cols = new_sp_m014:newrel_f65, 
    names_to = "key", 
    values_to = "cases", 
    values_drop_na = TRUE
  )
who1
#We can get some hint of the structure of the values in the new key column by counting them:
who1 %>% 
  count(key)
#
