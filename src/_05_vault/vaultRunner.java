package _05_vault;

public class vaultRunner {
public static void main(String[] args) {
	
	
	
	Vault vault = new Vault();
JamesBond james = new JamesBond();

int finalcode = james.findCode(vault);

System.out.println(finalcode);

vault.TryCode(finalcode);

}
}
