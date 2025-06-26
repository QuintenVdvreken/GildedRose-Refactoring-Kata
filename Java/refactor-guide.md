## Huidige situatie
- UpdaupdateQuality() bevat teveel complexiteit en onoverzichtelijke code door de 'if' structuur 
- De code heeft teveel verantwoordelijkheden 
- is niet gemakkelijk uitbreidbaar 


# Analyse 
Ik zie dat er verschilende uitkomsten moeten zijn per uitkomst dus het strategy patern zou hier eventueel gebruikt kunnen worden 


# rules 

1. als SellIn = 0, quality twee keer zo snel naar beneden dus ipv -1 -2 
2. quality nooit onder 0 
