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
 *     Atom selection;
 *     Time time;
 * }
 * }
 */
public class XSelectionClearEvent {

    XSelectionClearEvent() {
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
        Xlib_h.C_LONG.withName("selection"),
        Xlib_h.C_LONG.withName("time")
    ).withName("$anon$847:9");

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

    private static final OfLong selection$LAYOUT = (OfLong)$LAYOUT.select(groupElement("selection"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Atom selection
     * }
     */
    public static final OfLong selection$layout() {
        return selection$LAYOUT;
    }

    private static final long selection$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Atom selection
     * }
     */
    public static final long selection$offset() {
        return selection$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Atom selection
     * }
     */
    public static long selection(MemorySegment struct) {
        return struct.get(selection$LAYOUT, selection$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Atom selection
     * }
     */
    public static void selection(MemorySegment struct, long fieldValue) {
        struct.set(selection$LAYOUT, selection$OFFSET, fieldValue);
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

    private static final long time$OFFSET = 48;

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

