abstract sealed class Apartment permits PenthouseSuite, SingleRoomApartment {
    int squareFootage;
    int numberOfBedrooms;

    abstract void setSquareFootage(int sqft);
}
