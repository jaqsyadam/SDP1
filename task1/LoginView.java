public interface LoginView {
    String getUsername();
    String getPassword();
    void showMessage(String message);
    void setPresenter(LoginPresenter presenter);
}

public class LoginViewImpl extends JFrame implements LoginView {
    private final JTextField usernameField = new JTextField(20);
    private final JPasswordField passwordField = new JPasswordField(20);
    private final JButton loginButton = new JButton("Login");
    private LoginPresenter presenter;

    public LoginViewImpl() {
        setLayout(new GridLayout(3, 2));
        add(new JLabel("Username:"));
        add(usernameField);
        add(new JLabel("Password:"));
        add(passwordField);
        add(loginButton);

        loginButton.addActionListener(e -> {
            if (presenter != null) presenter.handleLogin();
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    @Override
    public String getUsername() {
        return usernameField.getText();
    }

    @Override
    public String getPassword() {
        return new String(passwordField.getPassword());
    }

    @Override
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    @Override
    public void setPresenter(LoginPresenter presenter) {
        this.presenter = presenter;
    }
}
