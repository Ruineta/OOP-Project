public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERED];

    public int qtyOrdered;
    
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered >= MAX_NUMBER_ORDERED){
            System.out.println("The cart is almost full");
        }else{
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        }
    }

      
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        int findDisc = -1;
        if(qtyOrdered > 0){
            for(int i = 0; i < qtyOrdered; i++){
                if(itemsOrdered[i].getTitle().equals((disc.getTitle()))){
                    findDisc = i;
                }
            }
            if(findDisc != -1){
                for(int i = findDisc; i < qtyOrdered - 1; i++){
                    itemsOrdered[i] = itemsOrdered[i + 1];
                }
                
                itemsOrdered[qtyOrdered - 1] = null;
                qtyOrdered--;
                
                System.out.println("The disc has been removed");
            }else{
                System.out.println("The disc has not been found");
            }
        }
    }
        

    

    public float totalCost(){
        float sum = 0;
        for(int i = 0; i < qtyOrdered; i++){
            sum += itemsOrdered[i].getCost();
        }
        return sum;
    }
    
}
