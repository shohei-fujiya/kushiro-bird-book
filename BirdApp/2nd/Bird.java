class Bird {
    private String name;
    private String place;
    
    Bird(String name, String place){
        this.name = name;
        this.place = place;
    }

    public String getName(){
        return this.name;
    }

    public String getPlace(){
        return this.place;
    }
}