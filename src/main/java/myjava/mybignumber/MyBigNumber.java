package myjava.mybignumber;

/**
*<b>MyBigNumber<b>
*
*
*/
class MyBigNumber
{
	public String sum(String s1, String s2)
	{
		String result = "";
		
		int len1 = s1.length();
		int len2 = s2.length();
		int maxLen = (len1 > len2) ? len1 : len2;
		int index1 = 0;
		int index2 = 0; 
		char c1;
		char c2;

		int nho = 0;
		int t = 0 ;
		
		for(int i = 0; i <  maxLen; i++) 
		{
			index1 = (len1 - i -1);
			index2 = (len1 - i -1);
			
			c1 = (index1 >= 0) ? s1.charAt(index1) : '0';
			c2 = (index2 >= 0) ? s2.charAt(index2) : '0';

			t = (c1 - '0') + (c2 - '0') + nho;
			result = (t % 10) + result;
			nho = (t / 10);
		}
		if(nho != 0) 
        {
            result = nho + result;//
        }
        
        return result;// Trả về kết quả thu được
          
	}
}