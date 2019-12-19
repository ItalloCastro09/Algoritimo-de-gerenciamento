class GFG 
{ 
	// Método para alocar a memória
	// Blocos conforme o algoritimo First fit 
	static void firstFit(int blockSize[], int m, 
						int processSize[], int n) 
	{ 
		// Armazena o id do bloco  
		// Bloco alocado para um processo
		int allocation[] = new int[n]; 
	
		// Inicialmente nenhum bloco é atribuído a nenhum processo
		for (int i = 0; i < allocation.length; i++) 
			allocation[i] = -1; 
	
		// Escolhe cada processo e encontra os blocos adequados
		// De acordo com o tamanho que o anúncio atribui a ele
		for (int i = 0; i < n; i++) 
		{ 
			for (int j = 0; j < m; j++) 
			{ 
				if (blockSize[j] >= processSize[i]) 
				{ 
					// aloca o bloco J ao processo P[i]
					allocation[i] = j; 
	
					// Reduz a memória disponível neste bloco. 
					blockSize[j] -= processSize[i]; 
	
					break; 
				} 
			} 
		} 
	
		System.out.println("\nProcess No.\tProcess Size\tBlock no."); 
		for (int i = 0; i < n; i++) 
		{ 
			System.out.print(" " + (i+1) + "\t\t" + 
							processSize[i] + "\t\t"); 
			if (allocation[i] != -1) 
				System.out.print(allocation[i] + 1); 
			else
				System.out.print("Não alocado"); 
			System.out.println(); 
		} 
	} 
	public static void main(String[] args) 
	{ 
		int blockSize[] = {100, 500, 200, 300, 600}; 
		int processSize[] = {212, 417, 112, 426}; 
		int m = blockSize.length; 
		int n = processSize.length; 
		
		firstFit(blockSize, m, processSize, n); 
	} 
} 
