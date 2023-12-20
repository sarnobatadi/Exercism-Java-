class ResistorColor {
    int colorCode(String color) {
        
        int i=0;
       
        for(String s: colors())
            {
               
                if(color==s)
                {
                    break;
                } 
                 i++;
            }
        return i;
        
        
    }

    String[] colors() {
        String[] colour_list =   {"black",
    "brown",
    "red",
    "orange",
    "yellow",
    "green",
    "blue",
    "violet",
    "grey",
    "white"};
        
        return colour_list;
  
}
}
