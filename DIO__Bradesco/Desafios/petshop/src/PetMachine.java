class PetMachine {
    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;
    private Pet pet;

    public void takeShower() {
        if (pet == null) {
            System.out.println("Nenhum pet na máquina! Coloque um pet antes de dar banho.");
            return;
        }

        if (water < 10 || shampoo < 2) {
            System.out.println("Água ou shampoo insuficiente para dar banho.");
            return;
        }

        water -= 10;
        shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " foi lavado e está limpo.");
    }

    public void addWater() {
        if (water >= 30) {
            System.out.println("A máquina já está com a capacidade máxima de água.");
            return;
        }

        water += 2;
        System.out.println("Água adicionada. Nível atual: " + water + " litros.");
    }

    public void addShampoo() {
        if (shampoo >= 10) {
            System.out.println("A máquina já está com a capacidade máxima de shampoo.");
            return;
        }

        shampoo += 2;
        System.out.println("Shampoo adicionado. Nível atual: " + shampoo + " litros.");
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!clean) {
            System.out.println("A máquina está suja! Limpe-a antes de colocar um pet.");
            return;
        }

        if (hasPet()) {
            System.out.println("Já há um pet na máquina: " + this.pet.getName());
            return;
        }

        this.pet = pet;
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina.");
    }

    public void removePet() {
        if (pet == null) {
            System.out.println("Não há nenhum pet na máquina para remover.");
            return;
        }

        System.out.println("O pet " + pet.getName() + " foi removido.");
        clean = pet.isClean();
        pet = null;
    }

    public void wash() {
        if (water < 10 || shampoo < 2) {
            System.out.println("Água ou shampoo insuficiente para limpar a máquina.");
            return;
        }

        water -= 10;
        shampoo -= 2;
        clean = true;
        System.out.println("A máquina foi limpa.");
    }
}