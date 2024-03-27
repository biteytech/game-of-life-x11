// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct {
 *     int type;
 *     unsigned long serial;
 *     int send_event;
 *     Display *display;
 *     Window window;
 *     Window root;
 *     Window subwindow;
 *     Time time;
 *     int x;
 *     int y;
 *     int x_root;
 *     int y_root;
 *     unsigned int state;
 *     unsigned int button;
 *     int same_screen;
 * }
 * }
 */
public class XButtonEvent {

    XButtonEvent() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Xlib_h.C_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        Xlib_h.C_LONG.withName("serial"),
        Xlib_h.C_INT.withName("send_event"),
        MemoryLayout.paddingLayout(4),
        Xlib_h.C_POINTER.withName("display"),
        Xlib_h.C_LONG.withName("window"),
        Xlib_h.C_LONG.withName("root"),
        Xlib_h.C_LONG.withName("subwindow"),
        Xlib_h.C_LONG.withName("time"),
        Xlib_h.C_INT.withName("x"),
        Xlib_h.C_INT.withName("y"),
        Xlib_h.C_INT.withName("x_root"),
        Xlib_h.C_INT.withName("y_root"),
        Xlib_h.C_INT.withName("state"),
        Xlib_h.C_INT.withName("button"),
        Xlib_h.C_INT.withName("same_screen"),
        MemoryLayout.paddingLayout(4)
    ).withName("$anon$575:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int type
     * }
     */
    public static final OfInt type$layout() {
        return type$LAYOUT;
    }

    private static final long type$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int type
     * }
     */
    public static final long type$offset() {
        return type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int type
     * }
     */
    public static int type(MemorySegment struct) {
        return struct.get(type$LAYOUT, type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int type
     * }
     */
    public static void type(MemorySegment struct, int fieldValue) {
        struct.set(type$LAYOUT, type$OFFSET, fieldValue);
    }

    private static final OfLong serial$LAYOUT = (OfLong)$LAYOUT.select(groupElement("serial"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long serial
     * }
     */
    public static final OfLong serial$layout() {
        return serial$LAYOUT;
    }

    private static final long serial$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long serial
     * }
     */
    public static final long serial$offset() {
        return serial$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long serial
     * }
     */
    public static long serial(MemorySegment struct) {
        return struct.get(serial$LAYOUT, serial$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long serial
     * }
     */
    public static void serial(MemorySegment struct, long fieldValue) {
        struct.set(serial$LAYOUT, serial$OFFSET, fieldValue);
    }

    private static final OfInt send_event$LAYOUT = (OfInt)$LAYOUT.select(groupElement("send_event"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int send_event
     * }
     */
    public static final OfInt send_event$layout() {
        return send_event$LAYOUT;
    }

    private static final long send_event$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int send_event
     * }
     */
    public static final long send_event$offset() {
        return send_event$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int send_event
     * }
     */
    public static int send_event(MemorySegment struct) {
        return struct.get(send_event$LAYOUT, send_event$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int send_event
     * }
     */
    public static void send_event(MemorySegment struct, int fieldValue) {
        struct.set(send_event$LAYOUT, send_event$OFFSET, fieldValue);
    }

    private static final AddressLayout display$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("display"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Display *display
     * }
     */
    public static final AddressLayout display$layout() {
        return display$LAYOUT;
    }

    private static final long display$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Display *display
     * }
     */
    public static final long display$offset() {
        return display$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Display *display
     * }
     */
    public static MemorySegment display(MemorySegment struct) {
        return struct.get(display$LAYOUT, display$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Display *display
     * }
     */
    public static void display(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(display$LAYOUT, display$OFFSET, fieldValue);
    }

    private static final OfLong window$LAYOUT = (OfLong)$LAYOUT.select(groupElement("window"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Window window
     * }
     */
    public static final OfLong window$layout() {
        return window$LAYOUT;
    }

    private static final long window$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Window window
     * }
     */
    public static final long window$offset() {
        return window$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Window window
     * }
     */
    public static long window(MemorySegment struct) {
        return struct.get(window$LAYOUT, window$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Window window
     * }
     */
    public static void window(MemorySegment struct, long fieldValue) {
        struct.set(window$LAYOUT, window$OFFSET, fieldValue);
    }

    private static final OfLong root$LAYOUT = (OfLong)$LAYOUT.select(groupElement("root"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Window root
     * }
     */
    public static final OfLong root$layout() {
        return root$LAYOUT;
    }

    private static final long root$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Window root
     * }
     */
    public static final long root$offset() {
        return root$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Window root
     * }
     */
    public static long root(MemorySegment struct) {
        return struct.get(root$LAYOUT, root$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Window root
     * }
     */
    public static void root(MemorySegment struct, long fieldValue) {
        struct.set(root$LAYOUT, root$OFFSET, fieldValue);
    }

    private static final OfLong subwindow$LAYOUT = (OfLong)$LAYOUT.select(groupElement("subwindow"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Window subwindow
     * }
     */
    public static final OfLong subwindow$layout() {
        return subwindow$LAYOUT;
    }

    private static final long subwindow$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Window subwindow
     * }
     */
    public static final long subwindow$offset() {
        return subwindow$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Window subwindow
     * }
     */
    public static long subwindow(MemorySegment struct) {
        return struct.get(subwindow$LAYOUT, subwindow$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Window subwindow
     * }
     */
    public static void subwindow(MemorySegment struct, long fieldValue) {
        struct.set(subwindow$LAYOUT, subwindow$OFFSET, fieldValue);
    }

    private static final OfLong time$LAYOUT = (OfLong)$LAYOUT.select(groupElement("time"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Time time
     * }
     */
    public static final OfLong time$layout() {
        return time$LAYOUT;
    }

    private static final long time$OFFSET = 56;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Time time
     * }
     */
    public static final long time$offset() {
        return time$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Time time
     * }
     */
    public static long time(MemorySegment struct) {
        return struct.get(time$LAYOUT, time$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Time time
     * }
     */
    public static void time(MemorySegment struct, long fieldValue) {
        struct.set(time$LAYOUT, time$OFFSET, fieldValue);
    }

    private static final OfInt x$LAYOUT = (OfInt)$LAYOUT.select(groupElement("x"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static final OfInt x$layout() {
        return x$LAYOUT;
    }

    private static final long x$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static final long x$offset() {
        return x$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static int x(MemorySegment struct) {
        return struct.get(x$LAYOUT, x$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int x
     * }
     */
    public static void x(MemorySegment struct, int fieldValue) {
        struct.set(x$LAYOUT, x$OFFSET, fieldValue);
    }

    private static final OfInt y$LAYOUT = (OfInt)$LAYOUT.select(groupElement("y"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static final OfInt y$layout() {
        return y$LAYOUT;
    }

    private static final long y$OFFSET = 68;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static final long y$offset() {
        return y$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static int y(MemorySegment struct) {
        return struct.get(y$LAYOUT, y$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int y
     * }
     */
    public static void y(MemorySegment struct, int fieldValue) {
        struct.set(y$LAYOUT, y$OFFSET, fieldValue);
    }

    private static final OfInt x_root$LAYOUT = (OfInt)$LAYOUT.select(groupElement("x_root"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int x_root
     * }
     */
    public static final OfInt x_root$layout() {
        return x_root$LAYOUT;
    }

    private static final long x_root$OFFSET = 72;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int x_root
     * }
     */
    public static final long x_root$offset() {
        return x_root$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int x_root
     * }
     */
    public static int x_root(MemorySegment struct) {
        return struct.get(x_root$LAYOUT, x_root$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int x_root
     * }
     */
    public static void x_root(MemorySegment struct, int fieldValue) {
        struct.set(x_root$LAYOUT, x_root$OFFSET, fieldValue);
    }

    private static final OfInt y_root$LAYOUT = (OfInt)$LAYOUT.select(groupElement("y_root"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int y_root
     * }
     */
    public static final OfInt y_root$layout() {
        return y_root$LAYOUT;
    }

    private static final long y_root$OFFSET = 76;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int y_root
     * }
     */
    public static final long y_root$offset() {
        return y_root$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int y_root
     * }
     */
    public static int y_root(MemorySegment struct) {
        return struct.get(y_root$LAYOUT, y_root$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int y_root
     * }
     */
    public static void y_root(MemorySegment struct, int fieldValue) {
        struct.set(y_root$LAYOUT, y_root$OFFSET, fieldValue);
    }

    private static final OfInt state$LAYOUT = (OfInt)$LAYOUT.select(groupElement("state"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int state
     * }
     */
    public static final OfInt state$layout() {
        return state$LAYOUT;
    }

    private static final long state$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int state
     * }
     */
    public static final long state$offset() {
        return state$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int state
     * }
     */
    public static int state(MemorySegment struct) {
        return struct.get(state$LAYOUT, state$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int state
     * }
     */
    public static void state(MemorySegment struct, int fieldValue) {
        struct.set(state$LAYOUT, state$OFFSET, fieldValue);
    }

    private static final OfInt button$LAYOUT = (OfInt)$LAYOUT.select(groupElement("button"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned int button
     * }
     */
    public static final OfInt button$layout() {
        return button$LAYOUT;
    }

    private static final long button$OFFSET = 84;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned int button
     * }
     */
    public static final long button$offset() {
        return button$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned int button
     * }
     */
    public static int button(MemorySegment struct) {
        return struct.get(button$LAYOUT, button$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned int button
     * }
     */
    public static void button(MemorySegment struct, int fieldValue) {
        struct.set(button$LAYOUT, button$OFFSET, fieldValue);
    }

    private static final OfInt same_screen$LAYOUT = (OfInt)$LAYOUT.select(groupElement("same_screen"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int same_screen
     * }
     */
    public static final OfInt same_screen$layout() {
        return same_screen$LAYOUT;
    }

    private static final long same_screen$OFFSET = 88;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int same_screen
     * }
     */
    public static final long same_screen$offset() {
        return same_screen$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int same_screen
     * }
     */
    public static int same_screen(MemorySegment struct) {
        return struct.get(same_screen$LAYOUT, same_screen$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int same_screen
     * }
     */
    public static void same_screen(MemorySegment struct, int fieldValue) {
        struct.set(same_screen$LAYOUT, same_screen$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

