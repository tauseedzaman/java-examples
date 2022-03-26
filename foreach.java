class foreach{
    public static void main(String args[]){
        String[] names={"tauseedzaman","osama","jabran"};
        // for each item in the array
        for(String name:names) {
            System.out.println("Welcome " + name);
        }
    }
}