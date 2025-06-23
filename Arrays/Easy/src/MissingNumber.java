class MissingNumber {
    // a^0= a;
    // a^a= 0;

    public int missingNumber(int[] nums) {
        int xor1= 0, xor2= 0;
        for(int i=0; i<nums.length; i++){
            xor1^= i;
            xor2^= nums[i];
        }

        xor1^= nums.length;

        return (xor1^xor2);

    }
}