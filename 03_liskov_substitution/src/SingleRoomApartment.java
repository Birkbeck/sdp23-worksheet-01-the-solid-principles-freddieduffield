public non-sealed class SingleRoomApartment extends Apartment {
    int numberOfBedrooms = 0;

    @Override
    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }
}
