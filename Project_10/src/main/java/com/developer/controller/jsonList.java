package com.developer.controller;

class jsonList {
    int index;
    String name;
    String resolution;
    int size;
    int created;

    public jsonList(){       
    }
    public jsonList(int index, String name, String resolution, int size, int created){
        this.index = index;
        this.name=name;
        this.resolution=resolution;
        this.size=size;
        this.created=created;
        
    }
    
    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public String getResolution() {
        return resolution;
    }

    public int getSize() {
        return size;
    }
    public int getCreated(){
        return created;
    }
    
}
