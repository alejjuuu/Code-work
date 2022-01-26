New_bands <- full_join(band_members,band_instruments)
New_band<- New_bands %>% replace_na(list(name="Mike",plays="violin"))
New_band1<-New_band %>% replace_na(list(name="Keith",band="Metallica"))
New_band1
