// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct {
 *     int type;
 *     unsigned long serial;
 *     int send_event;
 *     Display* display;
 *     Window window;
 *     Window root;
 *     Window subwindow;
 *     Time time;
 *     int x;
 *     int y;
 *     int x_root;
 *     int y_root;
 *     unsigned int state;
 *     unsigned int keycode;
 *     int same_screen;
 * };
 * }
 */
public class XKeyEvent {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("type"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_LONG_LONG$LAYOUT.withName("serial"),
        Constants$root.C_INT$LAYOUT.withName("send_event"),
        MemoryLayout.paddingLayout(32),
        Constants$root.C_POINTER$LAYOUT.withName("display"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("window"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("root"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("subwindow"),
        Constants$root.C_LONG_LONG$LAYOUT.withName("time"),
        Constants$root.C_INT$LAYOUT.withName("x"),
        Constants$root.C_INT$LAYOUT.withName("y"),
        Constants$root.C_INT$LAYOUT.withName("x_root"),
        Constants$root.C_INT$LAYOUT.withName("y_root"),
        Constants$root.C_INT$LAYOUT.withName("state"),
        Constants$root.C_INT$LAYOUT.withName("keycode"),
        Constants$root.C_INT$LAYOUT.withName("same_screen"),
        MemoryLayout.paddingLayout(32)
    );
    public static MemoryLayout $LAYOUT() {
        return XKeyEvent.$struct$LAYOUT;
    }
    static final VarHandle type$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("type"));
    public static VarHandle type$VH() {
        return XKeyEvent.type$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int type;
     * }
     */
    public static int type$get(MemorySegment seg) {
        return (int)XKeyEvent.type$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int type;
     * }
     */
    public static void type$set(MemorySegment seg, int x) {
        XKeyEvent.type$VH.set(seg, x);
    }
    public static int type$get(MemorySegment seg, long index) {
        return (int)XKeyEvent.type$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void type$set(MemorySegment seg, long index, int x) {
        XKeyEvent.type$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle serial$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("serial"));
    public static VarHandle serial$VH() {
        return XKeyEvent.serial$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned long serial;
     * }
     */
    public static long serial$get(MemorySegment seg) {
        return (long)XKeyEvent.serial$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned long serial;
     * }
     */
    public static void serial$set(MemorySegment seg, long x) {
        XKeyEvent.serial$VH.set(seg, x);
    }
    public static long serial$get(MemorySegment seg, long index) {
        return (long)XKeyEvent.serial$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void serial$set(MemorySegment seg, long index, long x) {
        XKeyEvent.serial$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle send_event$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("send_event"));
    public static VarHandle send_event$VH() {
        return XKeyEvent.send_event$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int send_event;
     * }
     */
    public static int send_event$get(MemorySegment seg) {
        return (int)XKeyEvent.send_event$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int send_event;
     * }
     */
    public static void send_event$set(MemorySegment seg, int x) {
        XKeyEvent.send_event$VH.set(seg, x);
    }
    public static int send_event$get(MemorySegment seg, long index) {
        return (int)XKeyEvent.send_event$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void send_event$set(MemorySegment seg, long index, int x) {
        XKeyEvent.send_event$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle display$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("display"));
    public static VarHandle display$VH() {
        return XKeyEvent.display$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Display* display;
     * }
     */
    public static MemorySegment display$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)XKeyEvent.display$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Display* display;
     * }
     */
    public static void display$set(MemorySegment seg, MemorySegment x) {
        XKeyEvent.display$VH.set(seg, x);
    }
    public static MemorySegment display$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)XKeyEvent.display$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void display$set(MemorySegment seg, long index, MemorySegment x) {
        XKeyEvent.display$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle window$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("window"));
    public static VarHandle window$VH() {
        return XKeyEvent.window$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Window window;
     * }
     */
    public static long window$get(MemorySegment seg) {
        return (long)XKeyEvent.window$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Window window;
     * }
     */
    public static void window$set(MemorySegment seg, long x) {
        XKeyEvent.window$VH.set(seg, x);
    }
    public static long window$get(MemorySegment seg, long index) {
        return (long)XKeyEvent.window$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void window$set(MemorySegment seg, long index, long x) {
        XKeyEvent.window$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle root$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("root"));
    public static VarHandle root$VH() {
        return XKeyEvent.root$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Window root;
     * }
     */
    public static long root$get(MemorySegment seg) {
        return (long)XKeyEvent.root$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Window root;
     * }
     */
    public static void root$set(MemorySegment seg, long x) {
        XKeyEvent.root$VH.set(seg, x);
    }
    public static long root$get(MemorySegment seg, long index) {
        return (long)XKeyEvent.root$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void root$set(MemorySegment seg, long index, long x) {
        XKeyEvent.root$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle subwindow$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("subwindow"));
    public static VarHandle subwindow$VH() {
        return XKeyEvent.subwindow$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Window subwindow;
     * }
     */
    public static long subwindow$get(MemorySegment seg) {
        return (long)XKeyEvent.subwindow$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Window subwindow;
     * }
     */
    public static void subwindow$set(MemorySegment seg, long x) {
        XKeyEvent.subwindow$VH.set(seg, x);
    }
    public static long subwindow$get(MemorySegment seg, long index) {
        return (long)XKeyEvent.subwindow$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void subwindow$set(MemorySegment seg, long index, long x) {
        XKeyEvent.subwindow$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle time$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("time"));
    public static VarHandle time$VH() {
        return XKeyEvent.time$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * Time time;
     * }
     */
    public static long time$get(MemorySegment seg) {
        return (long)XKeyEvent.time$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * Time time;
     * }
     */
    public static void time$set(MemorySegment seg, long x) {
        XKeyEvent.time$VH.set(seg, x);
    }
    public static long time$get(MemorySegment seg, long index) {
        return (long)XKeyEvent.time$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void time$set(MemorySegment seg, long index, long x) {
        XKeyEvent.time$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x"));
    public static VarHandle x$VH() {
        return XKeyEvent.x$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int x;
     * }
     */
    public static int x$get(MemorySegment seg) {
        return (int)XKeyEvent.x$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int x;
     * }
     */
    public static void x$set(MemorySegment seg, int x) {
        XKeyEvent.x$VH.set(seg, x);
    }
    public static int x$get(MemorySegment seg, long index) {
        return (int)XKeyEvent.x$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x$set(MemorySegment seg, long index, int x) {
        XKeyEvent.x$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y"));
    public static VarHandle y$VH() {
        return XKeyEvent.y$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int y;
     * }
     */
    public static int y$get(MemorySegment seg) {
        return (int)XKeyEvent.y$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int y;
     * }
     */
    public static void y$set(MemorySegment seg, int x) {
        XKeyEvent.y$VH.set(seg, x);
    }
    public static int y$get(MemorySegment seg, long index) {
        return (int)XKeyEvent.y$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y$set(MemorySegment seg, long index, int x) {
        XKeyEvent.y$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle x_root$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("x_root"));
    public static VarHandle x_root$VH() {
        return XKeyEvent.x_root$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int x_root;
     * }
     */
    public static int x_root$get(MemorySegment seg) {
        return (int)XKeyEvent.x_root$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int x_root;
     * }
     */
    public static void x_root$set(MemorySegment seg, int x) {
        XKeyEvent.x_root$VH.set(seg, x);
    }
    public static int x_root$get(MemorySegment seg, long index) {
        return (int)XKeyEvent.x_root$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void x_root$set(MemorySegment seg, long index, int x) {
        XKeyEvent.x_root$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle y_root$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("y_root"));
    public static VarHandle y_root$VH() {
        return XKeyEvent.y_root$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int y_root;
     * }
     */
    public static int y_root$get(MemorySegment seg) {
        return (int)XKeyEvent.y_root$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int y_root;
     * }
     */
    public static void y_root$set(MemorySegment seg, int x) {
        XKeyEvent.y_root$VH.set(seg, x);
    }
    public static int y_root$get(MemorySegment seg, long index) {
        return (int)XKeyEvent.y_root$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void y_root$set(MemorySegment seg, long index, int x) {
        XKeyEvent.y_root$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle state$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("state"));
    public static VarHandle state$VH() {
        return XKeyEvent.state$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int state;
     * }
     */
    public static int state$get(MemorySegment seg) {
        return (int)XKeyEvent.state$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int state;
     * }
     */
    public static void state$set(MemorySegment seg, int x) {
        XKeyEvent.state$VH.set(seg, x);
    }
    public static int state$get(MemorySegment seg, long index) {
        return (int)XKeyEvent.state$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void state$set(MemorySegment seg, long index, int x) {
        XKeyEvent.state$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle keycode$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("keycode"));
    public static VarHandle keycode$VH() {
        return XKeyEvent.keycode$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int keycode;
     * }
     */
    public static int keycode$get(MemorySegment seg) {
        return (int)XKeyEvent.keycode$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int keycode;
     * }
     */
    public static void keycode$set(MemorySegment seg, int x) {
        XKeyEvent.keycode$VH.set(seg, x);
    }
    public static int keycode$get(MemorySegment seg, long index) {
        return (int)XKeyEvent.keycode$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void keycode$set(MemorySegment seg, long index, int x) {
        XKeyEvent.keycode$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle same_screen$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("same_screen"));
    public static VarHandle same_screen$VH() {
        return XKeyEvent.same_screen$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int same_screen;
     * }
     */
    public static int same_screen$get(MemorySegment seg) {
        return (int)XKeyEvent.same_screen$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int same_screen;
     * }
     */
    public static void same_screen$set(MemorySegment seg, int x) {
        XKeyEvent.same_screen$VH.set(seg, x);
    }
    public static int same_screen$get(MemorySegment seg, long index) {
        return (int)XKeyEvent.same_screen$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void same_screen$set(MemorySegment seg, long index, int x) {
        XKeyEvent.same_screen$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


