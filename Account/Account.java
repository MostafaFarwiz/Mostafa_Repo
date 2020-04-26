public abstract class Account {

	protected Integer number;
	protected Real bal;

	public Integer getNumber() {
		return this.number;
	}

	public Real getBal() {
		return this.bal;
	}

	public Person getOwner() {
		// TODO - implement Account.getOwner
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param d
	 */
	public void deposite(Real d) {
		// TODO - implement Account.deposite
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param d
	 */
	public Boolean withdraw(Real d) {
		// TODO - implement Account.withdraw
		throw new UnsupportedOperationException();
	}

}