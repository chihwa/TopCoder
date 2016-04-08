public class StairClimb {

    public int stridesTaken(int[] flights, int stairsPerStride) {

        int r = (flights.length - 1) * 2;
        for(int f: flights){
            r += (f+stairsPerStride -1) / stairsPerStride;
        }
        return r;
    }
}
