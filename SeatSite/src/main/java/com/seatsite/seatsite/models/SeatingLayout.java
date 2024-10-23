package com.seatsite.seatsite.models;

import java.util.ArrayList;

public class SeatingLayout {

    private final ArrayList<SeatBlock> seatBlocks;
    private final int numBlocks;

    public SeatingLayout(int numBlocks) {
        this.numBlocks = numBlocks;
        this.seatBlocks = new ArrayList<>(numBlocks);
    }

    public void addBlock(SeatBlock block) {
        seatBlocks.add(block);
    }

    public ArrayList<SeatBlock> getSeatBlocks() {
        return seatBlocks;
    }

    public int getNumBlocks() {
        return numBlocks;
    }

    public void removeBlock(SeatBlock block) {
        seatBlocks.remove(block);    
    }
}