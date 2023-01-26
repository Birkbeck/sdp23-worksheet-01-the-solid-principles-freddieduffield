interface Greet {
    String greet();
}

public class Greeter implements Greet {
    String formality;

    public String greet() {
        if (this.formality == "formal") {
            return "Good evening";
        } else if (this.formality == "casual") {
            return "Goodday?";
        } else if (this.formality == "intimate") {
            return "Hello darling!";
        } else {
            return "Hello.";
        }
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}

class AccentGreeter implements Greet {
    String accent;

    @Override
    public String greet() {
        if (accent == "Australian") {
            return "Goodday mate";
        } else if (accent == "English") {
            return "alright mate";
        } else {
            return "hello";
        }
    }

    public void setAccent(String accent) {
        this.accent = accent;
    }
}
