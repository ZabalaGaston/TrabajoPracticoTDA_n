package trabajoPracticoTDA;

public interface Cola {

	public boolean offer(Integer dato);
	public Integer poll();
	public Integer peek();
	public boolean isEmpty();
	public void empty();
}