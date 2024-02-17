//Напишите метод, который принимает двумерный массив. Метод должен заменить значение в каждой ячейке массива-параметра на количество делителей этого значения.

import java.util.Random;
class Solution{
        int [][] createNewArray(int hight, int width){
                int[][] newArray = new int[hight][width];
                        Random random = new Random();
                                for(int i = 0; i < newArray.length; i++){
                                        for(int j = 0; j < newArray[i].length; j++){
                                                newArray[i][j] = random.nextInt(800) + 1;
                        }
                }
        return newArray;
        }
        void printArray(int[][] anyArray){
                for(int i = 0; i < anyArray.length; i++){
                        for(int j = 0; j < anyArray[i].length; j++){
                                if(j == 0){
                                        System.out.print("[ ");
                                }
                                        if(j < anyArray[i].length - 1){
                                                System.out.printf("%3s, ", anyArray[i][j]);
                                                        }else{
                                                                System.out.printf("%3s ]", anyArray[i][j]);
                                                        }
                                }System.out.println();
                }System.out.println();
        }
        void howManyDevisors(int anyNumber){
                int i = 1;
                        int count = 0;
                                while(i <= anyNumber){
                                        if(anyNumber % i == 0){
                                count++;
                        }
                        i++;
                }
                System.out.printf("В числе %3s %3s делителей.", anyNumber, count);
        System.out.println();
        }

     static int devisor(int anyNumber){
                int i = 1;
                        int count = 0;
                                while(i <= anyNumber){
                                        if(anyNumber % i == 0){
                                count++;
                        }
                        i++;
                }
                return count;
        }
	int[][] changeValue(int [][] anyArray){
		for(int i = 0; i < anyArray.length; i++){
			for(int j = 0; j < anyArray[i].length; j++){
				anyArray[i][j] = devisor(anyArray[i][j]);
			}
		}
		return anyArray;
	}
}