/**
 * ===============================================================
 * Kotlin GUI Basic Starter
 * ===============================================================
 *
 * This is a starter project for a simple Kotlin GUI application.
 * The Java Swing library is used, plus the FlatLAF look-and-feel
 * for a reasonably modern look.
 */

import com.formdev.flatlaf.FlatDarkLaf
import java.awt.*
import java.awt.event.*
import javax.swing.*


/**
 * Launch the application
 */
fun main() {
    FlatDarkLaf.setup()     // Flat, dark look-and-feel
    MainWindow()            // Create and show the UI
}


/**
 * Main UI window (view)
 * Defines the UI and responds to events
 * The app model should be passwd as an argument
 */
class MainWindow : JFrame(), ActionListener {

    // Fields to hold the UI elements
    
    //Colour=Display=Modular=================================================================
    private lateinit var colourDisplayLabel: JButton

    //Red=Changer============================================================================
    private lateinit var redText: JTextField
    private lateinit var redButtonUp: JButton
    private lateinit var redButtonDown: JButton

    //Green=Changer==========================================================================
    private lateinit var greenText: JTextField
    private lateinit var greenButtonUp: JButton
    private lateinit var greenButtonDown: JButton

    //Blue=Changer===========================================================================
    private lateinit var blueText: JTextField
    private lateinit var blueButtonUp: JButton
    private lateinit var blueButtonDown: JButton

    /**
     * Configure the UI and display it
     */
    init {
        configureWindow()               // Configure the window
        addControls()                   // Build the UI

        setLocationRelativeTo(null)     // Centre the window
        isVisible = true                // Make it visible
    }

    /**
     * Configure the main window
     */
    private fun configureWindow() {
        title = "Kotlin Swing GUI Demo"
        contentPane.preferredSize = Dimension(600, 350)
        defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
        isResizable = false
        layout = null

        pack()
    }

    /**
     * Populate the UI with UI controls
     */
    private fun addControls() {
        val defaultFont = Font(Font.SANS_SERIF, Font.PLAIN, 30)

        colourDisplayLabel = JButton("Colour Display")
        colourDisplayLabel.horizontalAlignment = SwingConstants.CENTER
        colourDisplayLabel.bounds = Rectangle(100, 50, 160, 110)
        add(colourDisplayLabel)

        //Red=RGB=Changer============================================================================

        redText = JTextField("000 R")
        redText.bounds = Rectangle(100, 200, 100, 110)
        redText.addActionListener(this)
        redText.font= defaultFont
//        redText.addKeyListener(this)
        add(redText)

        redButtonUp = JButton("+")
        redButtonUp.bounds = Rectangle(210, 200, 50,50)
        redButtonUp.addActionListener(this)     // Handle any clicks
        add(redButtonUp)

        redButtonDown = JButton("-")
        redButtonDown.bounds = Rectangle(210, 260, 50,50)
        redButtonDown.addActionListener(this)     // Handle any clicks
        add(redButtonDown)

        //Green=RGB=Changer==========================================================================

        greenText = JTextField("000 G")
        greenText.bounds = Rectangle(300, 200, 100, 110)
        greenText.addActionListener(this)
        greenText.font = defaultFont
//        greenText.addKeyListener(this)
        add(greenText)

        greenButtonUp = JButton("+")
        greenButtonUp.bounds = Rectangle(410, 200, 50,50)
        greenButtonUp.addActionListener(this)
        add(greenButtonUp)

        greenButtonDown = JButton("-")
        greenButtonDown.bounds = Rectangle(410, 260, 50,50)
        greenButtonDown.addActionListener(this)     // Handle any clicks
        add(greenButtonDown)

        //Blue=RGB=Changer===========================================================================

        blueText = JTextField("000 B")
        blueText.bounds = Rectangle(300, 50, 100, 110)
        blueText.addActionListener(this)
        blueText.font= defaultFont
//        blueText.addKeyListener(this)
        add(blueText)

        blueButtonUp = JButton("+")
        blueButtonUp.bounds = Rectangle(410, 50, 50,50)
        blueButtonUp.addActionListener(this)     // Handle any clicks
        add(blueButtonUp)

        blueButtonDown = JButton("-")
        blueButtonDown.bounds = Rectangle(410, 110, 50,50)
        blueButtonDown.addActionListener(this)     // Handle any clicks
        add(blueButtonDown)
    }


    /**
     * Handle any UI events (e.g. button clicks)
     */
    override fun actionPerformed(e: ActionEvent?) {
        when (e?.source) {
            redButtonUp -> {

            }
        }
    }

}

